
public class Cylinder {

		double radius;
		double height;
		//getter
		double getradius(){
			
			return radius;
		}
		double getheight() {
			return height;}
		
		public void setradius(double radius) {
			this.radius=radius;}
		
		public void setheight(double height) {
			this.height=height;}
		
		//area of cylinder
		double areacylinder() {
			double area= 2 * Math.PI * radius *(radius + height);
			return area;
		}
		double volumecylinder() {
			double volume=Math.PI * radius * radius * height;
			return volume;
		}
			
		}
		

	

