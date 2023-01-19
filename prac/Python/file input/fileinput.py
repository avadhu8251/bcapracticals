# import fileinput
import fileinput

# Using fileinput.input() method
for line in fileinput.input(files ='test.txt'):
	print(line)
