

import java.util.List;
import java.util.Map;

class SwiftClass implements SwiftCallable {
    final String name;
    final SwiftClass superclass;
    private final Map<String, SwiftFunction> methods;

    SwiftClass(String name, SwiftClass superclass, Map<String, SwiftFunction> methods) {
        this.name = name;
        this.superclass = superclass;
        this.methods = methods;
    }

    SwiftFunction findMethod(SwiftInstance instance, String name) {
        if (methods.containsKey(name)) {
            return methods.get(name).bind(instance);
        }

        if (superclass != null) {
            return superclass.findMethod(instance, name);
        }

        return null;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> arguments) {
        SwiftInstance instance = new SwiftInstance(this);

        SwiftFunction initializer = methods.get("init");
        if (initializer != null) {
            initializer.bind(instance).call(interpreter, arguments);
        }

        return instance;
    }

    @Override
    public int arity() {
        SwiftFunction initializer = methods.get("init");
        if (initializer == null) return 0;
        return initializer.arity();
    }
}