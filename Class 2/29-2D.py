ppl_list = [{}, {}, {}, {}]
for i in range(4):
    name, age, size = str(input("Enter name, age and shoe size: ")).split()
    ppl_list[i]["name"] = name
    ppl_list[i]["age"] = int(age)
    ppl_list[i]["size"] = int(size)

for e in ppl_list:
    print(e["name"], e["age"])