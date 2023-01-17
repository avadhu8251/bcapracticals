NumList = [ ]
Even = [ ]
Odd = [ ]
Number = int(input("How many elements in list :- "))
for i in range(1, Number + 1):
    value = int(input("Please enter the Value of %d Element :- " %i))
    NumList.append(value)
for j in range(Number):
    if(NumList[j] % 2 == 0):
        Even.append(NumList[j])
    else:
        Odd.append(NumList[j])
print("\n Element in Even List is : ", Even)
print("\n Element in Odd List is : ", Odd)
