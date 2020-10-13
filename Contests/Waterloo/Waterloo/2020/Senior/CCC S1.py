#ccc 2020 s1 - Sprinters Speed - Mark
# data
#3
#0 100
#20 50
#10 120
import sys; input=sys.stdin.readline
N = int(input())
places = []
for i in range(N):
    places.append(tuple(map(int, input().split())))#a list of tuples [(0, 100), (20, 50), (10, 120)]

#consecutive points have higher slope - sorted required
places = sorted(places)
#observation after [[0, 100], [10, 120], [20, 50] ]	- sorted by x[0]

#find max slope
fastest = 0
for i in range(N-1):
    j = i + 1
    if places[i][0] != places[j][0]:
        speed = abs((places[i][1] - places[j][1])/(places[i][0] - places[j][0]))
        if speed > fastest:
            fastest = speed
print(fastest)
