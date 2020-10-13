#ccc 2020 s1 - Sprinters Speed - Luigi
import sys
n = int(sys.stdin.readline())
# data
#3
#0 100
#20 50
#10 120
observations = []

for y in range(n):
	observations.append([int(x) for x in sys.stdin.readline().split()])# this appends a list of lists
#observation is [[0, 100], [20, 50], [10, 120]]	
	
#consecutive points have higher slope - sorted required	
observations.sort(key=lambda x: x[0]) #sorst a list of lists by x[0] of each list
#observation after [[0, 100], [10, 120], [20, 50] ]	- sorted by x[0]

#find max slope
maxvel = 0
for i in range(n-1):
	t = observations[i][0]-observations[i+1][0]
	d = observations[i][1]-observations[i+1][1]
	vel = d/t
	if abs(vel) > maxvel:
		maxvel = abs(vel)
print(maxvel)
