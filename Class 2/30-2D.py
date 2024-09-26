ppl_list = {}
for i in range(4):
    name, age, size = str(input("Enter name, age and shoe size: ")).split()
    ppl_list[name] = {}
    ppl_list[name]["age"] = int(age)
    ppl_list[name]["size"] = int(size)

remove_name = str(input("Enter the name to remove: "))
ppl_list.pop(remove_name)
for name in ppl_list:
    print(name, ppl_list[name]["age"], ppl_list[name]["size"])