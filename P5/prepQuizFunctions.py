def test_is_prime():
    assert is_prime(2) == True
    assert is_prime(4) == False
    assert is_prime(1) == False

import pytest
def test_factorial():
    with pytest.raises(ValueError):
        factorial(-1)
    assert factorial(1) == 1
    assert factorial(5) == 120