import java.text.DecimalFormat
fun main(){
    val currency = DecimalFormat("$.00")
    println("Enter a number to select the type of customer.")
    var userAns = 0
    do{
        println("1) commercial customer")
        println("2) residential customer")
        println("3) done")
        print("Enter choice: ")
        userAns = readLine()!!.toInt()
        var customerType = "Error please enter a valid number"
        when (userAns){
            1 -> customerType = "commercial customer"
            2 -> customerType = "residential customer"
            3 -> customerType = "done"
        }
        if (userAns == 1){
            println("userAns is 1, that means commercial")
            println("enter customer name: ")
            var customerName: String = readLine()!!
            println("enter customer phone: ")
            var customerPhone: String = readLine()!!
            println("enter customer address: ")
            var customerAddress: String = readLine()!!
            println("enter square footage: ")
            var squareFootage: Double = readLine()!!.toDouble()
            println("enter property name: ")
            var propertyName: String = readLine()!!
            println("are there multiple properties? enter true or false")
            var multiProperty: Boolean = readLine()!!.toBoolean()
            var rate: Double = 5.0
            var customer0 = Commercial(propertyName, rate, multiProperty, customerName, customerPhone, customerAddress, squareFootage)
            customer0.printAll()
            println("the weekly charge is " + currency.format(customer0.weeklyCharges(squareFootage, rate)))
            println("")
        }
        if (userAns == 2){
            println("userAns is 2, that means residential")
            println("enter customer name: ")
            var customerName: String = readLine()!!
            println("enter customer phone: ")
            var customerPhone: String = readLine()!!
            println("enter customer address: ")
            var customerAddress: String = readLine()!!
            println("enter square footage: ")
            var squareFootage: Double = readLine()!!.toDouble()
            println("is the customer a senior citizen? enter true or false")
            var senior: Boolean = readLine()!!.toBoolean()
            var rate: Double = 0.0
            var customer0 = Residential(senior, rate, customerName, customerPhone, customerAddress, squareFootage)
            customer0.printAll()
            println("the weekly charge is " + currency.format(customer0.weeklyCharges(squareFootage, rate)))
            println("")
        }
        println("you have selected number $userAns: $customerType")
    }while (userAns != 3)
}