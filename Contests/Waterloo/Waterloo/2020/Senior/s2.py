def findCoords(v):
	f = []
	for i in range(1, v+1):
		if v%i==0:
			if int(v/i) <= m and i <= n:
				f.append([int(v/i),i])
			else:
				break
	return f

import sys

m = int(sys.stdin.readline())
n = int(sys.stdin.readline())

grid = []
for y in range(m):
	row = []
	for x in sys.stdin.readline().split():
		row.append(int(x))
	grid.append(row)


visited = [[False for i in range(n)] for j in range(m)]
q = [[1,1]]
possible = False
while q:
	cur = q.pop(0);
	if not visited[cur[0]-1][cur[1]-1]:			
		val = grid[cur[0]-1][cur[1]-1]
		visited[cur[0]-1][cur[1]-1] = True
	else:
		continue
		
	factors = findCoords(val)
	q.extend(factors)
	
	if [m, n] in q:
		possible = True
		break

print("yes" if possible else "no")