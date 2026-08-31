def check_animal(animal):
    animals = ["cat", "dog", "blobfish", "shark", "owl", "toad"]
    for n in animals:
        if n == animal:
            return (animal + " is in the list")
    return (animal + " is not in the list")

print(check_animal("cat"))
print(check_animal("penguin"))