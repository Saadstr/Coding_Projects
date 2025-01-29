#word=input("Enter a word: ")
def pastify (word):
    if word=="walk" or word=="greet" or word=="learn" or word=="jump" or word=="ascend" or word=="dance":
        print(word +"ed")
    elif word =="run" or word== "sit":
        change=word.replace(word[1],"a")
        print(change)
    elif word=="draw" or word=="grow":
        change1=word.replace(word[2],"e")
        print(change1)
    else:
        print("")

#pastify(word)


def main(pastify):
    pastify("walk")
    pastify("greet")
    pastify("learn")
    pastify("jump")
    pastify("ascend")
    pastify("dance")
    pastify("run")
    pastify("sit")
    pastify("draw")
    pastify("grow")
    pastify("talk")#not in vocabulary
main(pastify)

word_counted=input("enter a word: ")
def quantify(word_counted):
    consonants= set("bcdfghjklmnpqrstvwxyz")
    const_count=0
    for char in word_counted:
        if char in consonants:
            const_count= const_count+1
    print("the number of consonants is " , const_count)

quantify(word_counted)

    