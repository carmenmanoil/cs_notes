L = int(input(""))
decode = ""

lastRun = L-1

for i in range(L):
	line = input(" ")


	if len(line) > 3:
		lineTimes = line[:2]
		lineCharacter = line[3]
		decode += (lineCharacter*int(lineTimes))
	else:
		lineTimes = line[0]
		lineCharacter = line[2]
		decode += (lineCharacter*int(lineTimes))


	if i != lastRun:
		decode += '\n'


print(decode)
