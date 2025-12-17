# Only submit function
def convert_to_fahrenheit(celsius: int) -> float:
    fahrenheit = (1.8 * int(celsius)) + 32
    round(fahrenheit)
    fahrenheit = int(fahrenheit)
    return fahrenheit

celsius = int(input("Enter the Temperature in Celsius :"))
print("Temperature in Fahrenheit :", convert_to_fahrenheit(celsius))