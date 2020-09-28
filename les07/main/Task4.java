package by.htp.les07.main;

public class Task4  {
		
			  private int h, m, s;

			  public Task4() {
			    setHour(0);
			    setMin(0);
			    setSec(0);
			  }

			  public Task4(int h, int m, int s) {
			    setHour(h);
			    setMin(m);
			    setSec(s);
			  }

			  public void setTime(int h, int m, int s) {
			    setHour(h);
			    setMin(m);
			    setSec(s);
			  }

			  public void setHour(int h) {
			    if (h >= 0 && h <= 23) {
			      this.h = h;
			    } else {
			      this.h = 0;
			    }
			  }

			  public void setMin(int m) {
			    if (m >= 0 && m <= 59) {
			      this.m = m;
			    } else {
			      this.m = 0;
			    }
			  }

			  public void setSec(int s) {
			    if (s >= 0 && s <= 59) {
			      this.s = s;
			    } else {
			      this.s = 0;
			    }
			  }

			  public void addSec(int ss) {
			    int m = ss / 60;
			    int s = ss % 60;

			    if (this.s + s > 59)
			       m++;

			    this.addMin(m);

			    this.s += s;
			  }

			  public void addMin(int mm) {
			    int h = mm / 60;
			    int m = mm % 60;

			    if (this.m + m > 59)
			      h++;

			    this.h += h;

			    if (this.h > 23)
			      this.h = 0;

			    this.m += m;
			  }

			  public void writeTime() {
			    System.out.printf("Текущее время: %02d:%02d:%02d\n", this.h, this.m, this.s);
			  }
			}
