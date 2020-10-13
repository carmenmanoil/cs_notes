#Score for Apple

aThreePS = int(input(" "))
aTwoPF = int(input(" "))
aOnePFT = int(input(" "))


aThreePS *= 3
aTwoPF *= 2

finalScoreApple = aThreePS + aTwoPF + aOnePFT

#Score for Bananas

bThreePS = int(input(" "))
bTwoPF = int(input(" "))
bOnePFT = int(input(" "))

bThreePS *= 3
bTwoPF *= 2

finalScoreBananas = bThreePS + bTwoPF + bOnePFT


if finalScoreBananas > finalScoreApple:
	print("B")

elif finalScoreBananas < finalScoreApple:
	print("A")

elif finalScoreBananas == finalScoreApple:
	print("T")

