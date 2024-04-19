Intro

In my final project proposal, I proposed to make a simple 2D ping-pong game, which I accomplished. 
The rules of the game stated in the proposal still stand. Which is that the ball starts off near the center 
of the window and moves in a set direction, the player controls a paddle on the left with their mouse, 
the PC controls a paddle on the right by following the ball's Y position, the ball may bounce off either 
paddle or the top and bottom of the screen, as the ball bounces back and forth its speed will increase 
resulting in the game's difficulty being harder and if the ball gets past either paddle the opposing 
player gets a point and the game resets. Using the “Think Java” textbook, some guidance from a peer and 
minimal YouTube help, I was able to take and use the information from the book and translate that into code 
that allowed me to accomplish these things and some more. 

How to play

The players of the game are a user and a pc/bot. To play the game, all the user has to do is move their mouse up 
and down (on the Y axis of the left side of the screen) to control their paddle. The user needs to move their paddle 
in order to hit the ball and avoid it from getting past their paddle. If the ball does go past the paddle 
(on either side) then the opposing player gets a point. If the ball gets past the user's paddle, on the left, 
then the bot gets a point and vice versa. The game does keep track of each player's score, it increases by just
one after each score. After every score the game will pause for 2 seconds before resetting to a new round. 
The bot is able to hit the ball with the paddle by tracking the ball's position using its y coordinate. In the 
future, I hope to incorporate keys to play the game rather than the mouse. That will allow for the code to be further
developed so that two users can play at the same time.

Game logic

There are different components used in the game to make it fair for both the user and pc, also to allow the game 
to act as a legitimate ping-pong game. The user’s paddle has a speed of 16, which is faster than the pc and is fast
enough to maintain fairness. The speed of the pc’s paddle is 13, being lower since the chances of the pc missing the ball is lower. 
I believe this is a fair logic because the pc is able automatically to track the ball’s y position, it may be likely to 
never miss the ball if it’s paddle speed is any higher or the same as the users. Additionally, though it doesn't make a 
huge difference, the pc’s paddle is slightly smaller than the users. Pc paddle height is 140 and the user paddle height is 150.

The ball starts off in the middle of the screen and begins to bounce slowly in a set of directions. After the ball 
makes two bounces in the game, its speed increases by 2. However, the speed cannot exceed past 16, as that is the maximum 
speed. With the logic of the pc’s paddle speed being  (s)lower than the users, this also creates fairness and serves 
as a benefit for the user being that the pc can automatically track and adapt to the ball's position. As the speed of 
the ball increases, it lowers the chances of the pc hitting it every time. Allowing for the pc to lose some games, as 
well as the user. The ball’s speed increase serves as the game's difficulty level. So it becomes challenging for both 
players as the difficulty (or speed of the ball) increases. 

Challenges and concerns

These decisions did not come immediately during the coding process. There was a lot of trial and error, as well as 
testing different numbers, sizes and speeds in order to make everything both fair and smooth for each player. Though
I had a good mindset going into the coding aspect of the game and knowing what I wanted to include in terms of the 
components, it was somewhat difficult to make everything make sense in the coding aspect. What this means is that I 
had to put a lot of time and thought into certain numbers (like speeds for example), to keep the overall game logical and fair. 

Along with this, setting the coordinates and boundaries for different components of the game was somewhat challenging 
as well. An example of what I mean by this is the boundary for the paddles, or their peak range on the y-axis. The paddles
dont go above a certain point in the window’s height, but they are able to go slightly out of the frame. Another 
example is the ball’s boundaries (collision and bouncing off the corners). The challenging part here was using the 
correct variables (or java language) so that the program could recognize what the boundaries were based on language 
and numbers I used. The same goes for the paddle components as well. 

The last of my "challenges" was placement and spacing of components. Though this was not a huge challenge to overcome, 
and it essentially was a part of the whole trial and error process. I found myself doing a lot of trial and error to 
find the correct spacing for components,in terms of numbers. For example, with the score, there was a negative number 
to get one of the score counts on the opposite side of the line I created in the game. This was just one of the many 
spacing challenges I encountered. However, I am aware this will all still come with the creation of games and other complex 
coding, in order to maintain a smooth flow of everything. 

Conclusion

Overall, I learned a lot from this project and picked up new coding knowledge in the duration of this project. 
There are things I would like to change and/or extend for further development of the game. For instance the key controls, 
which would allow for two users to play the game. Along with other things like experiment with the random class for the 
direction of the ball. 
