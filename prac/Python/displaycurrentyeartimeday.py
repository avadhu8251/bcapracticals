import datetime

now = datetime.datetime.now()

print("Current Year: ", now.year)
print("Current Day: ", now.strftime("%A"))
print("Current Date: ", now.strftime("%Y-%m-%d"))