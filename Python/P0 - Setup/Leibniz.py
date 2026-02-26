pi = 0
for i in range(10000):
    pi += ((-1) ** i) * (4 / (2 * i + 1))

print(pi)