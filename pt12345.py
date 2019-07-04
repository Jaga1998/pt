num = int(input())
 
num1 = num
rev = 0
 
while num1 != 0:
	rev = (rev * 10) + (num1 % 10)
	num1 = num1 // 10
 
if num == rev:
	print(" yes")
else:
	print("no")
