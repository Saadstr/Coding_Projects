def find_bounce_height(drop_height,num_bounces):
    max_height=drop_height
    x=0   
    while x<num_bounces:
        max_height=max_height*.92
        x=x+1
    return max_height
def main():
    drop_height=int(input("How high is the ball dropped from in meters?: "))
    num_bounces=int(input("How many times do you want the ball to bounce?: "))
    myresult=find_bounce_height(drop_height,num_bounces)
    myresult=round(myresult,1)
    print("When the ball is dropped from ",drop_height," meters, after ",num_bounces," bounces the ball will reach a height of ",myresult," meters")
main()
