package studyjava;

public class SomeValueObject {
	private final Object com1;
	private final Object com2;
	private final Object com3;
	private final Object com4;
	private final Object com5;

	public static class Builder {
		private final Object com1;
		private final Object com2;

		private Object com3;
		private Object com4;
		private Object com5;

		public Builder(Object com1, Object com2) {
			this.com1 = com1;
			this.com2 = com2;
		}

		public Builder com3(Object com3) {
			this.com3 = com3;
			return this;
		}

		public Builder com4(Object com4) {
			this.com4 = com4;
			return this;
		}

		public Builder com5(Object com5) {
			this.com5 = com5;
			return this;
		}

		public SomeValueObject build() {
			return new SomeValueObject(this);
		}
	}

	private SomeValueObject(Builder builder) {
		com1 = builder.com1;
		com2 = builder.com2;
		com3 = builder.com3;
		com4 = builder.com4;
		com5 = builder.com5;
	}

	@Override
	public String toString() {
		return "SomeValueObject [com1=" + com1 + ", com2=" + com2 + ", com3=" + com3 + ", com4=" + com4 + ", com5="
				+ com5 + "]";
	}

}
