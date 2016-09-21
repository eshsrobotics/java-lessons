/******************************************************************************
 * What is a variable?
 *  => Variables are reserved memory locations to store values.
 *  (Explanation: Declaring a variable is like booking a hotel room, the variable
 *  tells the computers' memory (hotel) hey I want a room that fits 8 bits, the
 *  memory then hands the variable the "keys" to its "room".)
 *
 * Java has two data types.
 *  -> Primitive Data types
 *  -> Reference/Object Data Types.
 ******************************************************************************/

/******************************************************************************
 * Primitive Data Types.
 * => There are eight primitive data types predefined by Java using a reserved
 * keyword.
 ******************************************************************************/

/*
 * byte
 *
 * => An 8 bit signed two's complement integer.
 * => Max value that can be stored is 127 ( inclusive )
 * => Min value that can be stored is -128
 */
byte dontByte;
dontByte = 11; // Ok

dontByte = 127; // Ok

dontByte = -128; // Ok

dontByte = 128; // ????

dontByte = -129; // ????

/*
 * short
 *
 * => A 16 bit signed two's complement integer.
 * => Max value that can be stored is 32,767 ( inclusive )
 * => Min value that can be stored is -32,768
 */

short cakes;
cakes = 32,000; // Ok

cakes = -32,767; // Ok

cakes = 33,000; // ?

cakes = -32,769; // ?

/*
 * int
 *
 * => A 32 bit signed two's complement integer.
 * => Max value that can be stored is 2,147,483,647 ( inclusive )
 * => Min value that can be stored is -2,147,483,648
 */

int candles;
candles = 2000000000; // Ok

/*
 * long
 *
 * => A 64 bit signed two's complement integer.
 * => Max value that can be stored is 9,223,372,036,854,775,807 ( inclusive )
 * => Min value that can be stored is -9,223,372,036,854,775,808
 */

long horns;
horns = 9223372036854775807; // Ok

/*
 * float
 *
 * => A single precision 32 bit IEEEE 754 floating point
 * => What does that mean??? Its used for storing decimal point numbers.
 */

float balloons;
balloons = 3.2f;

/*
 * double
 *
 * => A double precision 64 bit IEEEE 754 floating point
 * What does that mean??? The decimal spacing is more precise than a float.
 */

double balloons;
balloons = 65.3;

/*
 * boolean
 *
 * => Stores 1 bit of data.
 * => Only two possible values. true or false ( 1 | 0 )
 */

boolean isWorking;
isWorking = true; // Ok

isWorking = false; // Ok

isWorking = 1; // ???

isWorking = 0; // ???

/*
 * char
 *
 * => Is a single 16 bit Unicode character
 */

char izard;
izard = 'a'; //Ok

izard = 'ç'; // ???

izard = '4'; // ???

izard = ''; // ???

izard = 'zz'; // ???

/******************************************************************************
 * Reference/Object Data Types.
 * => Created by instantiating an object using the 'new' keyword
 ******************************************************************************/

Robot potatoBot;
potatoBot = new Robot();

potatoBot = new Person(); // ??

/*
 * Rules for naming variables.
 */

/*
 * 1.
 * All Variable names must start with a letter of the alphabet , an underscore,
 * or a dollar sign ($)
 */
int foo; // ok

int _foo; // ok

int $foo; // ok

int 99luftballoons; // not ok

int foo_foo; // ??

int money$money // ??

/*
 * 2.
 * After the first character, variable names may contain numbers as well.
 */

int i8pi; // ok

/*
 * 3.
 * The name can be any length. Best practice is to keep the variable names
 * as short as possible while still being descriptive of the variables use
 */

int totalNumberOfHousesOnTheBlock; // Ok but bad practice

int numHouses; // This will do.

/*
 * 4.
 * Variable names are case sensitive. Variable names with all uppercase letters
 * are typically reserved for constant variables.
 */

int isVariable
  /* is different from */
int isvariable;

static final int WHEELS_ON_THE_BUS = 4 // Constant definition

/*
 * 5.
 * You cant use a java keyword (reserved word) for a variable name.
 */

int float; // Not ok

int break; // ??

int continue; // ??

/*
 * Standard convention
 *
 * Most programmers use one of 2 conventions for naming variables.
 * Stick to 1 throughout a project.
 */

/*
 * Snake Case.
 * When naming a long variable seperate the words using an underscore and keep
 * all letters lowercase.
 */

char dollar_sign;

float dollar_conversion_rate;

/*
 * Camel Case.
 * When naming a variable start the variable name with a lower case words and
 * then every word after that starts with an uppercase letter.
 */

char dollarSign;

float dollarConversionRate;
