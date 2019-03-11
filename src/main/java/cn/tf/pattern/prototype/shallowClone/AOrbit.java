package cn.tf.pattern.prototype.shallowClone;


/**
 * 游客轨迹（需要复制ProbeData中的数据，以便用于分析
 */
public class AOrbit  {

	private Prototype prototype;

	public AOrbit(Prototype prototype){
		this.prototype = prototype;
	}
	public Prototype startClone(Prototype prototype){
		return (Prototype)prototype.clone();
	}
}
