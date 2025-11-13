import math

def find_square_root(x):
    if not(isinstance(x, int) or isinstance(x, float)):
        raise ValueError("Input is not a number.")
    elif x < 0:
        raise ValueError("Cannot compute square root of negative numbers.")
    elif x == 0:
        return 0
    return math.sqrt(x)
        
    
# Runtime error: ValueError
# print(find_square_root(-1))
# Bug: Intentionally passing a string to test error handling
# print(find_square_root("string"))
