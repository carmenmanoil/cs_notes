# 2020 J3 Art - Max Michet
N = int(input())
xCoors = []
yCoors = []

for m in range(N):
    x, y = input().split(",")
    xCoors.append(int(x))
    yCoors.append(int(y))

#bottom:
botX = min(xCoors) - 1
botY = min(yCoors) - 1
#top:
topX = max(xCoors) + 1
topY = max(yCoors) + 1

print(str(botX) + "," +  str(botY))
print(str(topX) + "," +  str(topY))
