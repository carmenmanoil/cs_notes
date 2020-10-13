# 2020 J2 Epidemiology - Max Michet
P = int(input())# max
N = int(input()) # people day 0
R = int(input()) # of other infected
day = 0
total = 0
while total<=P:
    newInf = N*(R**day)
    total += newInf
    day+=1

print(day-1)
    



