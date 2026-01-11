food_cost = float(input("Please enter the cost of the food:\n"))
number_of_people = int(input("Please enter the number of people:\n"))

if number_of_people > 4:
    food_cost *= 1.1

individual_share = food_cost / number_of_people

print(f"Each person needs to pay {individual_share:.2f} GBP")
