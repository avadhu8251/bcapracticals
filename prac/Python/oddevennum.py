even_numbers = [] 
odd_numbers = [] 
start = 1 
end = 100 
for number in range(start, end + 1): 
    if number // 2 == number / 2:
        even_numbers.append(number)
    elif number // 2 != number / 2:
        odd_numbers.append(number)
print('Even numbers:', even_numbers) 
print('\n') 
print('Odd numbers:', odd_numbers)
