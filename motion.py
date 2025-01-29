chooser=int(input("To learn about the balls bounce height after a ceartain number of bounces enter 1 or to learn how many bounces it takes for the ball to reach 25 centimenters press 2: "))
if chooser==1:
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
if chooser==2:
    def find_bounce_height2(drop_height2,):
        max_height2=drop_height2
        count=0 
        while max_height2>.25:
            max_height2=max_height2*.92
            count=count+1
            
        return count
    def main2():
        drop_height2=int(input("How high is the ball dropped from in meters?: "))
        myresult2=find_bounce_height2(drop_height2)
        print("The ball will not go over 25 centimeters after the ",myresult2," bounce")
    main2()