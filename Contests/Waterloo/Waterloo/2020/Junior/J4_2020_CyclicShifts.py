# 2020 J4 CyclicShifts - Max Michet
T = input()
S =  input()


cyclicShifts = []
shift = ""
letters = list(S)
notNo = False
#determin cyclic shifts

for i in range(len(S)):
    shiftStr = ""
    letter = letters[0]
    letters.pop(0)
    letters.append(letter)
    shift = letters
    for l in shift:
        shiftStr += l
    cyclicShifts.append(shiftStr)

for cyclic in range(len(cyclicShifts)):
    if cyclicShifts[cyclic] in T:
      print("yes")
      notNo = True
      break

if (notNo==False):
    print("no")




