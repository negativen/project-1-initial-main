# Project 1
### Objectives
This assignment is designed just to get you going on the use of GitHub, IntelliJ and provide a review of basic Java concepts.  This should be an easy 50 points for you.

### Concepts Covered
* Java class design
* Basic Java concepts
* UML

### Details
* Review Java programming basics paying close attention to creating custom classes.
* Download the project template from https://github.com/UltimateSandbox/project-1-initial.git (Links to an external site.)  
```text
(Hint:  The easiest way to get the template without having to mess with any of the folder structure is to just download the ZIP file using the green Code button in GitHub at the link provided above.  You'll see a Download ZIP link once you click the Code button.  Once downloaded, just unzip it into the folder of your choice and open the project by pointing to that folder in IntelliJ.)
```
Complete the following programming assignment:
* Design & implement a class called Point that represents a location in the Cartesian plane.
* Include (at a minimum) the following methods:
- setX(double x), setY(double y), setPoint(double x, double y) - set the coordinates of the point.
- shiftX(double n), shiftY(double n) - shift a point by a given amount along one of the axes.
- distance(Point p2) - finds the distance to point p2.
- rotate(double angle) - rotates the point by a specified angle around the origin. The formula for rotation is as follows:
```text
x′=xcos(θ)−ysin(θ)
y′=xsin(θ)+ycos(θ)
```

* Any other methods you believe to be necessary.
* Your code should work with the driver class provided (Project1.java).
* Use the driver with no code modifications to test your class for the correct results.
* Use the informal UML below to complete your Point class.

![img.png](img.png)

### Expected Output
Once you get your Point class working, when you run the driver, you should see something similar to the following:
```text
Project 1 : Point Tester

Point 1: Point{x = 3.0, y = 1.0}
Point 2: Point{x = 6.0, y = 5.0}

Distance: 5.0

Rotated a 1.5707963267948966: Point{x = -0.9999999999999998, y = -0.9999999999999997}
Shifted b 4.47213595499958 away from original position: Point{x = 10.0, y = 3.0}

```

### Extra Credit
If you would like up to 5 points extra credit for this assignment, write unit tests for your Point class.  (Don't worry about testing the driver - it's actually rather untestable.)
Typically, with classes like these, we don't write unit tests for getter/setter pairs, so lets skip those.  (That'll be the rule for all of the projects.)  So the methods you'll need to write unit tests for (to get full points) are the following:

* shiftX
* shiftY
* rotate
* distance

### Helpful Hints 
- Utilize the Math class for the algorithm implementation.
- Utilize Google to find the distance formula.
- Make good use of whitespace and comments to make your implementation as clean as possible.
- Use good, SOLID object-oriented programming principles (pun intended) in your implementation.
- Deliverables
- Be sure you commit & push your code to GitHub.  If you don't push it, I won't be able to see it!
- Copy the URL for your repo (green button on your GitHub repos' page) and paste it into the Website URL field and click Submit Assignment!
