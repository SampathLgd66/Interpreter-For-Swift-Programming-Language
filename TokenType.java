

public enum TokenType {
    // Single-character tokens.
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,MODULO,

    // One or two character tokens.
    BANG, BANG_EQUAL,MODULO_EQUAL,
    EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,

    // Literals.
    IDENTIFIER, STRING, NUMBER,
    PLUS_EQUAL, MINUS_EQUAL, STAR_EQUAL, SLASH_EQUAL,

    // Keywords.
    VAR, FUNC, IF, ELSE, WHILE, FOR, RETURN, FALSE, TRUE,PRINT,AND,OR,NIL,CLASS,SUPER,THIS,IN,

    EOF
}

