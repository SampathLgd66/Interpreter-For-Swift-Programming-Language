

import java.util.List;

interface SwiftCallable {
    int arity();
    Object call(Interpreter interpreter, List<Object> arguments);
}
