# SciFi UI Project

Name: Conor Monahan

Student Number: C16475956
Course: DT282/2

# Description of the assignment: 
My assignment is  a spaceship user interface based in space. The ship has a first person view of its surroundings. From that perspective you can see distant planets, stars and meteors. On the control panel of the ship there is a radar located in the bottom right of the hud. The radar shows near by spaceships. On the hud also, there are 2 buttons and a speed bar which indicates how fast the ship is going. If the ship is going fast, stars will flicker quicker, if going slow, the stars will be visible for longer.

# Instructions
When the program is running, the user can click anywhere on the screen and a laser will shoot in that direction and on that point. Three planets are shown for the duration of the program, the user can shoot at these planets but since they are so far away it is unlikely they'll be impacted. Stars are constantly being shown throughout the program. The spaceship will speed up gradually and the stars will get faster. The user does not need to worry about this as the spaceship will speed itself up and slow itself down. Two buttons are presented to the user, one is labelled 'MeteorShower' which will create meteors on the screen and they will travel all around space, will be visible until turned off. The other button will change the colour of the speed bar and will hide the ball which is responsible for speeding up and slowing down the ship. If the user presses the 'space' key, a small distant red planet will appear, this is a rare planet and an 'easter egg' to my assignment.
# How it works
There are five main classes. Button,Radar,MovingCircle(mc),MovingCircle2(mc2) and Frame. Frame was used to draw the outline of the hud, this made a platform for the entire assignment. Button has 2 rectangular shaped buttons which are operated using the modulo of a variable. The variables j and k are eventually assigned a value of 1 which is then incremented when a button is pressed and then modulo takes place. Radar is a numerous circles, the coordinates on the radar indicating nearby ships is used using an opacity variable which will draw when the line of the radar hits certain points on the circle. The two moving circles are similar in terms of how they work, one in the speed bar, which increases its speed each time it hits the sides of the bar, the other circle involved in the meteor shwer also moves accross the screen but at a greater distance. In both cases, the circles know when to return on their journey and when to restart their journey.


# What I am most proud of in the assignment
The speed bar and stars and button to go with it or radar
The assignment itself was very interesting, I've always liked the idea of creating an object and watching it move around the screen and think to myself, "Hey, I made that, I did that!". Unlike most assignments, I kind of enjoyed this one. The toughest part was deciding on what to actually base my assignment on. I had many ideas but decicded on the spaceship because I thought it was interesting. The proudest moment of the assignment would probably be implementing the 'speed bar' and all the functions to go with it or the radar function. It took a very long time to get the circle on the speed bar to speed itself up and slow itself down once it reaches a certain speed. I'm proud how I connected to the stars and made the two sets flicker at each collision of the cirlce and the side of the bar. Putting the function together with an actual button was a challenge. It used to just work once, but I fixed that. I'm also proud of the radar, how the dots paint when the line hits a certain point on the circle, that was a challenge in itself too. This was very tough to implement but I eventually got it working.

# Markdown Tutorial
My youtube video is linked below 
This is a youtube video:

[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/YpF7g7RDW7Lw/0.jpg)](https://www.youtube.com/watch?v=pF7g7RDW7Lw)




//[![YouTube](https://www.youtube.com/watch?v=pF7g7RDW7Lw)


