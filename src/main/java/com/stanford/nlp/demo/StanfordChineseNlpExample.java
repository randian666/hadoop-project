//package com.stanford.nlp.demo;
//
//import edu.stanford.nlp.dcoref.CorefChain;
//import edu.stanford.nlp.dcoref.CorefCoreAnnotations;
//import edu.stanford.nlp.ling.CoreAnnotations;
//import edu.stanford.nlp.ling.CoreLabel;
//import edu.stanford.nlp.pipeline.Annotation;
//import edu.stanford.nlp.pipeline.StanfordCoreNLP;
//import edu.stanford.nlp.semgraph.SemanticGraph;
//import edu.stanford.nlp.semgraph.SemanticGraphCoreAnnotations;
//import edu.stanford.nlp.trees.Tree;
//import edu.stanford.nlp.trees.TreeCoreAnnotations;
//import edu.stanford.nlp.util.CoreMap;
//
//import java.util.List;
//import java.util.Map;
//
///**
// * Created by liuxun on 2017/7/11.
// */
//public class StanfordChineseNlpExample {
////    public static void main(String[] args) {
////
////        // 载入自定义的Properties文件
////        StanfordCoreNLP pipeline = new StanfordCoreNLP("StanfordCoreNLP-chinese.properties");
////
////        // 用一些文本来初始化一个注释。文本是构造函数的参数。
////        Annotation annotation;
////        annotation = new Annotation("我爱北京天安门，天安门上太阳升。");
////
////        // 运行所有选定的代码在本文
////        pipeline.annotate(annotation);
////
////        // 从注释中获取CoreMap List，并取第0个值
////        List<CoreMap> sentences = annotation.get(CoreAnnotations.SentencesAnnotation.class);
////        CoreMap sentence = sentences.get(0);
////
////        // 从CoreMap中取出CoreLabel List，逐一打印出来
////        List<CoreLabel> tokens = sentence.get(CoreAnnotations.TokensAnnotation.class);
////        System.out.println("字/词" + "\t " + "词性" + "\t " + "实体标记");
////        System.out.println("-----------------------------");
////        for (CoreLabel token : tokens) {
////            String word = token.getString(CoreAnnotations.TextAnnotation.class);
////            String pos = token.getString(CoreAnnotations.PartOfSpeechAnnotation.class);
////            String ner = token.getString(CoreAnnotations.NamedEntityTagAnnotation.class);
////            System.out.println(word + "\t " + pos + "\t " + ner);
////        }
////    }
//
//    public void runChineseAnnotators(){
//
//        String text = "克林顿说，华盛顿将逐步落实对韩国的经济援助。"
//                + "金大中对克林顿的讲话报以掌声：克林顿总统在会谈中重申，他坚定地支持韩国摆脱经济危机。";
//        Annotation document = new Annotation(text);
//        StanfordCoreNLP corenlp = new StanfordCoreNLP("StanfordCoreNLP-chinese.properties");
//        corenlp.annotate(document);
//        parserOutput(document);
//    }
//
//    public void parserOutput(Annotation document){
//        // these are all the sentences in this document
//        // a CoreMap is essentially a Map that uses class objects as keys and has values with custom types
//        List<CoreMap> sentences = document.get(CoreAnnotations.SentencesAnnotation.class);
//
//        for(CoreMap sentence: sentences) {
//            // traversing the words in the current sentence
//            // a CoreLabel is a CoreMap with additional token-specific methods
//            for (CoreLabel token: sentence.get(CoreAnnotations.TokensAnnotation.class)) {
//                // this is the text of the token
//                String word = token.get(CoreAnnotations.TextAnnotation.class);
//                // this is the POS tag of the token
//                String pos = token.get(CoreAnnotations.PartOfSpeechAnnotation.class);
//                // this is the NER label of the token
//                String ne = token.get(CoreAnnotations.NamedEntityTagAnnotation.class);
//
//                System.out.println(word+"\t"+pos+"\t"+ne);
//            }
//
//            // this is the parse tree of the current sentence
//            Tree tree = sentence.get(TreeCoreAnnotations.TreeAnnotation.class);
//            System.out.println("语法树：");
//            System.out.println(tree.toString());
//
//            // this is the Stanford dependency graph of the current sentence
//            SemanticGraph dependencies = sentence.get(SemanticGraphCoreAnnotations.CollapsedCCProcessedDependenciesAnnotation.class);
//            System.out.println("依存句法：");
//            System.out.println(dependencies.toString());
//        }
//
//        // This is the coreference link graph
//        // Each chain stores a set of mentions that link to each other,
//        // along with a method for getting the most representative mention
//        // Both sentence and token offsets start at 1!
//        Map<Integer, CorefChain> graph =
//                document.get(CorefCoreAnnotations.CorefChainAnnotation.class);
//    }
//}
