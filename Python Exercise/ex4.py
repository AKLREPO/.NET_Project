cars = 100
space_in_a_car = 4.0
drivers = 30
cars_not_driven = cars - drivers
cars_driven = drivers
passengers = 20
carpool_capacity = cars_driven * space_in_a_car
average_passengers_per_car = passengers / cars_not_driven

print "There are", cars, "cars available."
print "There are only" , drivers, "drivers available."
print "There will be", cars_not_driven, "empty cars today."
print "We can transport", carpool_capacity, "people today."
print "We have", passengers, "to carpool today."
print "We need to put about", average_passengers_per_car, "in each car."

#In line 8 the error occur due to invalid variable name
# carpool_capacity's result will be in integer value
# Decimal value
# = means assignment of a value to a variable
