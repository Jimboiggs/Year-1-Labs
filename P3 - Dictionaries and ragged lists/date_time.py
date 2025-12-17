from datetime import datetime, timedelta

now = datetime.now()

# subtract 2 hours from now
date = now - timedelta(hours = 48)

# find the difference between the two datetime objects
delta = now - date
seconds = delta.total_seconds()

print(f'{date:%B %d, %Y, %H:%M:%S}')
print(f'Difference of {seconds} seconds')

print(delta + delta)

print(now + delta)