# s = input()
# f=0
# while(len(s) != 1):
#     if s[0] == s[1]:
#         # s[1] = "0"
#         s = s[1:]
#         s = s.replace(s[0], "0")
#     else:
#         f=1
#         break
# if f==0:
#     print("yes")
# else:
#     print("no")



# cook your dish here'

t = int(input())

while t>0:
    n = int(input())
    s = input()
    f=0
    sum = 0
    while(len(s) != 1):
        if s[0] == s[1]:
        # s[1] = "0"
            s = s[1:]
            sum =sum + 1
            s = s.replace(s[0], "0")
        else:
            f=1
            break
    if f==0:
        print("yes")
    else:
        print("no")
    t = t-1