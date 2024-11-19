public class Operators {
  /*
  Arithmetic Operators
Arithmetic operators perform basic math operations such as addition (+),
subtraction (-), multiplication (*), division (/), and modulus (%).
   */
  public void useArithmeticOperators(){
      int x = 11;
      int y = 5;

      System.out.println("Addition: " + (x + y));        // Addition
      System.out.println("Subtraction: " + (x - y));     // Subtraction
      System.out.println("Multiplication: " + (x * y));  // Multiplication
      System.out.println("Division: " + (x / y));        // Division
      System.out.println("Modulus: " + (x % y));         // Remainder
  }

/*
Logical /Conditional Operators
Logical operators allow multiple conditions in a single statement and return a boolean value. Java’s logical operators include:
- && (AND): True if both conditions are true.
- || (OR): True if at least one condition is true.
- ! (NOT): Inverts the boolean value.
 */

    public void useLogicalOperators(){
        int age =  20;
        boolean hasMembership = false;

        //Using AND (&&) operator
        System.out.println(("Can access club: " + (age >=18 && hasMembership)));

        //Using OR (||) operator
        System.out.println(("Can join trail: " + (age >=18 || hasMembership)));

        //Using NOT (!) operator
        System.out.println("No membership: " + !hasMembership);
    }

    /*
    Type casting converts one data type to another.
    Implicit casting (widening) is automatic from smaller to larger types,
    while explicit casting (narrowing) requires manual conversion.

     */

    public void useTypeCasting(){
        //Implicit casting (widening)
        int intVal = 45;
        double doubleVal = intVal;   //automatic conversion from int to double
        System.out.println("Implicit casting(int to double): " + doubleVal);

        //Explicit casting (narrowing)
        double price = 29.99;
        int roundedPrice = (int) price;  //Manual conversion from double to int
        System.out.println("Explicit casting (double to int); " + roundedPrice);
    }

    /*
    Assignment operators assign values to variables. Compound assignment operators (e.g., +=, -=, *=, /=, %=)
    combine an arithmetic operation with assignment.
     */
    public void useAssignmentOperators(){
        int x = 10;

        x += 5;  // Equivalent to x = x + 5
        System.out.println("Final value of x: " + x);

        x -= 2;  // Equivalent to x = x - 2
        System.out.println("Final value of x: " + x);
        x *= 3;  // Equivalent to x = x * 3
        System.out.println("Final value of x: " + x);
        x /= 2;  // Equivalent to x = x / 2
        System.out.println("Final value of x: " + x);
        x %= 3;  // Equivalent to x = x % 3


        System.out.println("Final value of x: " + x);  // Expected output: 1


    }
    /*
    Unary operators operate on a single operand. They include increment (++),
     decrement (--), positive (+), and negative (-). Increment and decrement operators
     can be prefix (++x) or postfix (x++), with prefix operators modifying the variable before
     returning the value, and postfix operators modifying it after.
     */

    public void useUnaryOperators(){
        int a = 10;

        int b = ++a;  // Prefix increment: a is incremented to 11, then b is assigned 11
        int c = a--;  // Postfix decrement: c is assigned 11, then a is decremented to 10

        int d = ++a;

        System.out.println("a: " + a);  // Expected output: 10
        System.out.println("b: " + b);  // Expected output: 11
        System.out.println("c: " + c);  // Expected output: 11

        System.out.println("a: " + a);  // Expected output: 10

        System.out.println("d: " + d);  // Expected output: 11
        int i;
        for(i=0; i<=10; i+=3){
            System.out.println(i);
        }

        int x;
        for(x=0; x<=10; x++){
            System.out.println(x);
        }
    }

    /*
    1  1  1  1  1  1       1       1
   128 64   32  16   8  4  2  1
    Bitwise operators operate on the binary representation of integers,
     allowing manipulation at the bit level.
     Bitwise operations are powerful for tasks requiring fine-grained control
      over binary data, making them essential for systems programming, cryptography, graphics,


The operators include:
& (AND): Sets each bit to 1 if both bits are 1.
| (OR): Sets each bit to 1 if one of the two bits is 1.
^ (XOR): Sets each bit to 1 if only one of the two bits is 1.

Bit shift operators shift the bits of a number left or right:

<< (Left Shift): Shifts bits to the left, filling with 0s.
>> (Right Shift): Shifts bits to the right, filling with the sign bit (for negative numbers).


     */
    public void useBitwise(){

        int x = 6;	// Binary: 0000 0110
        int y = 3;	// Binary: 0000 0011

//

        // Bitwise operations
        int andResult = x & y;  // AND: 0000 0010 (2 in decimal)
        int orResult = x | y;   // OR:  0000 0111 (7 in decimal)
        int xorResult = x ^ y;  // XOR: 0000 0101 (5 in decimal)

        System.out.println("AND result: " + andResult);
        System.out.println("OR result: " + orResult);
        System.out.println("XOR result: " + xorResult);

//        int x = 6;	// Binary: 0000 0110
//        int y = 3;	// Binary: 0000 0011

        // Bit shift operations
        int leftShift = x << 1;  // Left shift: 0000 1100 (12 in decimal)
        int rightShift = x >> 1; // Right shift: 0000 0011 (3 in decimal)

        System.out.println("Left Shift: " + leftShift);
        System.out.println("Right Shift: " + rightShift);

    }

    /*
    Cryptographic algorithms require manipulation of data at the binary
     level for encryption, decryption, hashing, and generating secure keys.
     Using XOR for a simple cipher:

     */
    public void useBitwiseForCryptography(){
        int data = 42; // Original data
        int key = 7;   // Encryption key

        int encoded = data ^ key; // Encrypt: XOR with key
        int decoded = encoded ^ key; // Decrypt: XOR again with the same key

        System.out.println("Encoded: " + encoded); // Encrypted data
        System.out.println("Decoded: " + decoded); // Original data
    }

/*
The ternary operator is a shorthand for an if-else statement.
It has the syntax: condition ? value_if_true : value_if_false.
 */
    public void useTernary(){
        int age = 18;
        String eligibility = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Eligibility: " + eligibility);  // Expected output: "Adult"

        age = 17;
        if(age >= 18){
            eligibility = "Adult";
            System.out.println("Eligibility: " + eligibility);
        }else{
            eligibility = "Minor";
            System.out.println("Eligibility: " + eligibility);
        }

    }

    /*
    Operator precedence determines the order in which operators are evaluated. Associativity (left-to-right or right-to-left)
    specifies the direction of evaluation for operators with the same precedence.
    Parenthesis, Exponents, Multiplication, Division, Add, Subtract
     */

    public void useOrderPrecedence(){
        int result = 10 + 20/ 5;   // * has higher precedence than +
        System.out.println("Result: " + result);  // Expected output: 20

        int resultWithParentheses = (10 + 2) * 5;
        System.out.println("Result with parentheses: " + resultWithParentheses);  // Expected output: 60

    }

    /*
    The remainder operator (%) gives the remainder of a division operation, useful for
    checking even/odd numbers or cycling through values.
     */
    public void useModulus(){
        int number = 8;

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");  // Expected output: "7 is odd."
        }

    }
}
