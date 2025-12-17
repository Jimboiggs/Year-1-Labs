# Only submit function
def convert_to_celsius(fahrenheit: int) -> int:
    celsius = 0.0
    fahrenheit = float(fahrenheit)
    celsius = (fahrenheit - 32) * (5 / 9)
    round(celsius)
    celsius = int(celsius)
    return celsius

fahrenheit = int(input("Enter the Temperature in Fahrenheit :"))
print("Temperature in Celsius :", convert_to_celsius(fahrenheit))