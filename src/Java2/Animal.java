package Java2;

// Is a -> sub-classification -> describing families of objects
public class Animal {}

class Feline extends Animal { // A feline is an animal
}
class Cat extends Feline { // A cat is a feline
}
class Canine extends Animal { // A canine is an animal
}
class Dog extends Canine { // A dog is a canine
}

class Transportation {}
class Ship extends Transportation {}
class Airplanes extends Transportation {}
