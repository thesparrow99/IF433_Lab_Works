package oop_00000130569_MuhamadZhakyAlamsyah.Week_08

class User(val name: String)
class Address(val city: City?){}
class DeliverDetails(val address: Address?){}
class Order(val deliverDetails: DeliverDetails?, val totalPrice: Int?){}