VOWEL = ['a', 'e', 'i', 'o', 'u']

def pig_latin(input_word):
    input_word = input_word.lower()
    if input_word[0] in VOWEL:
        return input_word + "way"
    else:
        return input_word[1:] + input_word[0] + "ay"

input_word = str(input("Enter a word: "))
new_word = pig_latin(input_word)
print(new_word)