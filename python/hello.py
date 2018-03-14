import sys

def main(args):
    name = args.get("name", "stranger")
    greeting = "Hello " + name + "!"
    print(greeting)
    sys.stderr.write("Python to stderr\n")
    return {"greeting": greeting}
