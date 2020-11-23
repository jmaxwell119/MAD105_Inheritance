open class Customer (customerName: String,
                     customerPhone: String,
                     customerAddress: String,
                     squareFootage: Double){
    var customerName: String = ""
    var customerPhone: String = ""
    var customerAddress: String = ""
    var squareFootage: Double = 0.0

    init {
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerAddress = customerAddress
        this.squareFootage = squareFootage
    }

    open fun printAll(){
        println("customer name: " + customerName + "\ncustomer phone: " + customerPhone + "\ncustomer address: " + customerAddress + "\nsquare footage: " + squareFootage)
    }
}

class Commercial (propertyName: String, rate: Double, multiProperty: Boolean, customerName: String, customerPhone: String, customerAddress: String,
                  squareFootage: Double): Customer(customerName, customerPhone, customerAddress, squareFootage){
    var propertyName: String
    var rate: Double
    var multiProperty: Boolean
    init{
        this.multiProperty = multiProperty
        this.rate = rate
        this.propertyName = propertyName
    }
    // if there's multiple properties, provide a 10% discount
    fun weeklyCharges(squareFootage: Double, rate: Double): Double{
    var weeklyCharges = (squareFootage / 1000) * rate
    if (multiProperty){
        weeklyCharges *= .9
    }
    return weeklyCharges
    }
    override fun printAll(){
        println("customer name: " + customerName + "\ncustomer phone: " + customerPhone + "\ncustomer address: " + customerAddress + "\nsquare footage: " + squareFootage
        + "\nmultiple properties? " + multiProperty)
    }
}

class Residential (senior: Boolean, rate: Double, customerName: String, customerPhone: String, customerAddress: String,
                   squareFootage: Double): Customer(customerName, customerPhone, customerAddress, squareFootage){
    var senior: Boolean
    // if senior is true, provide a 15% discount
    var rate: Double
    // A constant rate at $6 per 1000 square feet
    // (square feet / 1000) * 5
    init{
        this.senior = senior
        this.rate = rate
    }
    fun weeklyCharges(squareFootage: Double, rate: Double): Double{
        var weeklyCharges = (squareFootage / 1000) * rate
        if (senior){
            weeklyCharges *= .85
        }
        return weeklyCharges
    }
    override fun printAll(){
        println("customer name: " + customerName + "\ncustomer phone: " + customerPhone + "\ncustomer address: " + customerAddress + "\nsquare footage: " + squareFootage
        + "\nsenior? " + senior)
    }
}