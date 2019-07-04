a = int(input())


if a > 1:
    for i in range(2, a):
        if (a % i) == 0:
            print("no")
            break
    else:
        print("yes")

# if the entered a is less than or equal to 1
# then it is not prime a
else:
    print("no")
