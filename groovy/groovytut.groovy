// https://www.youtube.com/watch?v=B98jc8hdu9g

class GroovyTut {
 static void main(String[] args) {

  println("Hello World");

  // dynamic typing
  def age = "Dog";
  age = 40;

  // basic math
  /*
  		println("5 + 4 = " + (5 + 4));
  		println("5 - 4 = " + (5 - 4));
  		println("5 * 4 = " + (5 * 4));
  		println("5 / 4 = " + (5.intdiv(4)));
  		println("5 % 4 = " + (5 % 4));

  		println("5.2 + 4.4 = " + (5.plus(4.4)));
  		println("5.2 - 4.4 = " + (5.minus(4.4)));
  		println("5.2 * 4.4 = " + (5.multiply(4.4)));
  		println("5.2 / 4.4 = " + (5 / 4.4));

  		println("3 + 2 * 5 = " + (3 + 2 * 5));
  		println("(3 + 2) * 5 = " + ((3 + 2) * 5));
  */

  // increms & decrems
  /*
  		println("age++ = " + (age++)); // incrementing by one, but only after printing
  		println("++age = " + (++age)); // incrementing by one, before printing
  		println("age-- = " + (age--)); // decrementing by one, but only after printing
  		println("--age = " + (--age)); // decrementing by one, before printing
  */

  // Int or Float or Double?
  /*
  		println("Biggest Int " + Integer.MAX_VALUE);
  		println("Smalest Int " + Integer.MIN_VALUE);

  		println("Biggest Float " + Float.MAX_VALUE);
  		println("Smalest Float " + Float.MIN_VALUE);

  		println("Biggest Double " + Double.MAX_VALUE);
  		println("Smalest Double " + Double.MIN_VALUE);
  */

  // more math
  /*
  		def randNum = 2.0;
  		println("Math.abs(9) = " + (Math.abs(9)));
  		println("Math.round(9) = " + (Math.round(9)));
  		println("randNum.pow(3) = " + (randNum.pow(3)));
  		println("3.0.equals(2.0) = " + (3.0.equals(2.0)));
  		println("Math.sqrt(9) = " + (Math.sqrt(9)));
  		println("Math.cbrt(9) = " + (Math.cbrt(9)));
  		println("Math.log(9) = " + (Math.log(9)));
  		println("Math.log10(9) = " + (Math.log10(9)));
  		println("Math.ceil(9.4) = " + (Math.ceil(9.4)));
  		println("Math.floor(9.6) = " + (Math.floor(9.6)));
  		println("Math.min(9,10) = " + (Math.min(9,10)));
  		println("Math.max(9,10) = " + (Math.max(9,10)));
  		println("Math.toDegrees(Math.PI) = " + (Math.toDegrees(Math.PI)));
  		println("Math.toRadians(90)) = " + (Math.toRadians(90)));
  		println("Math.abs(new Random().nextInt() % 100) + 1 = " + (Math.abs(new Random().nextInt() % 100) + 1));

  		// sin, cos, tan, asin, acos, atan, sinh, cosh, tanh
  		println("Math.sin(0.5 * Math.PI) = " + (Math.sin(0.5 * Math.PI)));
  */

  // strings
  /*
		def name = "Derek";
		println('I am ${name}\n'); // single quotes don't work
		println("I am ${name}\n"); // don't really need the curly braces, just a convention
		println("1st 3 Chars " + name[0..2]);
		println("Every other Char " + name[0,2,4]);
		println("Substring at 1 to 4 " + name.substring(1,4));
		println("My Name " + name);
		println("My Name ".concat(name));
		println("My Name " * 2);
		println("Derek == Derek " + ('Derek'.equals('Derek')));
		println("Derek == derek " + ('Derek'.equalsIgnoreCase('derek')));
		println("Length " + name.length());
		println("Split " + name.split('r'));
		println("List " + name.toList());
		println("Uppercase " + name.toUpperCase());
		println("Lowercase " + name.toLowerCase());

		// nifty
		println("Ant <=> Banana " + ('Ant' <=> 'Banana'));
		println("Banana <=> Ant " + ('Banana' <=> 'Ant'));
		println("Ant <=> Ant " + ('Ant' <=> 'Ant'));

		def mult = '''I am a string
		that goes on
		across multiple lines''';
		println("I am ${mult}\n"); // don't really need the curly braces, just a convention
		println("3rd Index of Name " + name[3]);
		println("Index of r " + name.indexOf('r'));
  */

  // more strings incl raw input
  /*
		def randString = "Random";
		println("A $randString string");
		printf("A %s string \n", randString);
		printf("%-10s %d %.2f %10s \n",
		['Stuff', 10, 1.234, 'Random']);

		print("Whats your name ");
		def fName = System.console().readLine();
		println("Hello " + fName);

		print("Enter a number ");
		def num1 = System.console().readLine().toDouble();
		print("Enter a number ");
		def num2 = System.console().readLine().toDouble();
		printf("%.2f + %.2f = %.2f \n", [num1, num2, (num1 + num2)]);
  */

  // lists
  /*
		def primes = [2,3,5,7,11,13];
		println("2nd prime " + primes[1]);
		println("3rd prime " + primes.get(2));

		def employee = ['Derek', 40, 6.25, [1,2,3]];
		println("2nd Number " + employee[3][1]);

		println("Length " + primes.size());
		primes.add(17);
		primes<<19;
		primes.add(23);
		primes + [29,31];
		primes - 31
		println("Is Empty " + primes.isEmpty());
		println("1st 3 " + primes[0..2]);
		println(primes);
		println("Matches " + primes.intersect([2,3,7]));
		println("Reverse " + primes.reverse());
		println("Sort " + primes.sort());
		println("Last " + primes.pop());
  */

  // maps aka dicts
  /*
		def paulMap = [
		'name' : 'Paul',
		'age' : 35,
		'address' : '123 Main St',
		'list' : [1,2,3],
		];

		paulMap.put('city', 'Pittsburgh');

		println("Name " + paulMap['name']);
		println("Age " + paulMap.get('age'));
		println("List Item " + paulMap['list'][1]);
		println("Has City " + paulMap.containsKey('city'));
		println("Size " + paulMap.size());
  */

  // ranges
  /*
		def oneTo10 = 1..10;
		def aToZ = 'a'..'z';
		def zToA = 'z'..'a';
		println(oneTo10);
		println("Size " + oneTo10.size());
		println("2nd Item " + oneTo10.get(1));
		println("Contains 11 " + oneTo10.contains(11));
		println("Get First " + oneTo10.getFrom());
		println("Get Last " + oneTo10.getTo());
		println(aToZ);
		println(zToA);
  */

  // conditionals
  /*
		def ageOld = 6;
		if(ageOld == 5){
		println("Go to Kindergarten");
		} else if((ageOld > 5) && (ageOld < 18)){
		printf("Go to grade %d \n", (ageOld - 5));
		} else {
		println("Go to College");
		}

		def canVote = true;
		println(canVote ? "Can Vote" : "Can't Vote");

		switch(ageOld) {
		case 16: println("You can drive");
		case 18:
		println("You can vote");
		break;
		default: println("Have Fun");
		}

		switch(ageOld) {
		case 0..6 : println("Child"); break;
		case 7..12 : println("Teenage"); break;
		case 13.18 : println("Young Adult"); break;
		default : println("Adult");
		}
  */

  // loops
  /*
		def i = 0;
		while (i < 10) {
		if (i % 2) {
		i++;
		continue;
		}
		if (i == 8) {
		break;
		}

		println(i);
		i++;
		}

		for (i = 0; i < 5; i++){
		println(i);
		}

		for (j in 2..6){
		println(j);
		}

		def randList = [10,12,13,14];

		for (j in randList){
		println(j);
		}

		def custs = [
		100 : 'Paul',
		200 : 'Sally',
		300 : 'James',
		]

		for (cust in custs){
		println("$cust.value : $cust.key");
		}
  */

  // methods aka functions
  /*
		sayHello();

		println("5 + 4 = " + getSum(5,4));

		def myName = "Derek";
		passByValue(myName);
		println("In Main " + myName);

		def listToDouble = [1,2,3,4];
		listToDouble = doubleList(listToDouble);
		println(listToDouble);

		def nums = sumAll(1,2,3,4);
		println("Sum : " + nums);
		println(listToDouble);

		def factorial = factorial(4);
		println("Factorial 4 : " + factorial);

		}

		static def sayHello(){
		println("Hello");
		}

		static def getSum(num1=0, num2=0){
		return num1 + num2;
		}

		static def passByValue(name){
		name = "In Function";
		println("Name : " + name);
		}

		static def doubleList(list){
		def newList = list.collect { it * 2 };
		return newList;
		}

		static def sumAll(int... num){
		def sum = 0;
		num.each { sum += it; }
		return sum;
		}

		static def factorial(num) {
		if(num <= 1){
		return 1;
		} else {
		return (num * factorial(num - 1));
		}
		}
  */

  // closures
  /*
		def getFactorial = {num -> (num <= 1 ? 1 : num * call(num - 1))}

		println(" Factorial 4 : " + getFactorial(4));

		def greeting = "Goodbye";
		def sayGoodbye = {theName -> println("$greeting $theName")}
		sayGoodbye("Derek");

		def numList = [1,2,3,4];
		numList.each {println(it)};

		def employees = [
		'Paul' : 34,
		'Sally' : 35,
		'Sam' : 36,]

		employees.each {println("$it.key : $it.value");}

		def randNums = [1,2,3,4,5,6];
		randNums.each {num -> if(num % 2 == 0)
		println(num)};

		def namelist = ["Doug", "Sally", "Sue"];

		def matchEle = namelist.find {item -> item == "Sue"}

		println(matchEle);

		def randNumList = [1,2,3,4,5,6,];
		def numMatches = randNumList.findAll {item -> item > 4}
		println(numMatches);

		println("> 5 : " + randNumList.any {item -> item > 5})
		println("> 1: " + randNumList.every {item -> item > 1})
		println("Double : " + randNumList.collect {item -> item * 2})

		def getEven = {num -> return(num % 2 == 0)}
		def evenNums = listEdit(randNumList, getEven);
		println("Evens : " + evenNums);

		}

		static def listEdit(list, clo){
		return list.findAll(clo);
		}
  */

  // file io
  /*
		new File("test.txt").eachLine {
		line -> println "$line";
		}

		new File("test.txt").withWriter('utf-8') {
		writer -> writer.writeLine("Line 4");
		}

		File file = new File("test.txt");
		file.append('Line 5');

		println(file.text);

		println("File Size: ${file.length()}");
		println("Dir : ${file.isDirectory()}");

		def newFile = new File("test2.txt");
		newFile << file.text;

		newFile.delete();

		def dirFiles = new File("").listRoots();

		dirFiles.each {
		item -> println file.absolutePath;
		}
  */

  // OOP
  /*
		def king = new Animal('King', 'Growl');

		println("$king.name says $king.sound");

		king.setSound('Grrrrrr');

		println("$king.name says $king.sound");

		king.run();

		println(king.toString());

		def grover = new Dog('Grover', 'Grrr', 'Derek');

		king.makeSound();
		grover.makeSound();
  */
  
 }

}
