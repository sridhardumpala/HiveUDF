package com.sample;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

//import org.apache.hadoop.mapreduce.Counter;
public class WordCountMapper extends
		Mapper<LongWritable, Text, Text, LongWritable> {
	private Text temp = new Text();
	
	public void map(Text key, LongWritable value, Context context) throws IOException, InterruptedException
	{
	 String line=value.toString();
	 String[] words=line.split("\t");
	 keyEmit.set(words[0]);
	 valEmit.set(words[1]);
	 context.write(keyEmit, valEmit);
	
	}
	
	
	
	
	
	
	
	
	/*private final static LongWritable one = new LongWritable(1);

	@Override
	protected void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {
		String line = value.toString();
		String[] words = line.split(" ");
		for (int i = 0; i < words.length; i++) {
			context.write(new Text(words[i]), one);
		}
		/*StringTokenizer strtock = new StringTokenizer(str);
		while (strtock.hasMoreTokens()) {
			temp.set(strtock.nextToken());
			context.write(temp, one);
		}*/
	}

}*/
