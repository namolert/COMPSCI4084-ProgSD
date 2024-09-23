VOWEL = ['a', 'e', 'i', 'o', 'u']

input_alpha = str(input("Enter an alphabet: "))

if len(input_alpha) > 1:
    print("Incorrect input!")
elif input_alpha in VOWEL:
    print("The letter is vowel")
elif input_alpha == 'y':
    print("The letter is sometimes vowel, and sometimes consonant")
else:
    print("The letter is consonant")