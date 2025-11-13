def divide_numbers(numerator, divisor) -> float:
    try:
        result = numerator / divisor
    except Exception as e:
        raise ValueError("Cannot divide by zero. Please provide a non-zero divisor.")

    return result