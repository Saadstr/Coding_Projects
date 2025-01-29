def convert(dec_num):
    if(dec_num > 1):
        convert(dec_num//2)
    print(dec_num%2,end="")
def main():
    dec_num=int(input("Enter a number: "))
    convert(dec_num)
main()
