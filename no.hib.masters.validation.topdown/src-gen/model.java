			
			[Serializable()]
			public class HtmlRoot {
			}

			
			[Serializable()]
			public class FormStep {
					[ System.Xml.Serialization.XmlElement("stepTitle") ]
					public string stepTitle { get; set; }
			}

			
			[Serializable()]
			public class FormElement {
					[ System.Xml.Serialization.XmlElement("ID") ]
					public string ID { get; set; }
			}

			
			[Serializable()]
			public class Label {
					[ System.Xml.Serialization.XmlElement("ID") ]
					public string ID { get; set; }
					[ System.Xml.Serialization.XmlElement("value") ]
					public string value { get; set; }
					[ System.Xml.Serialization.XmlElement("constrastRatio") ]
					public string constrastRatio { get; set; }
			}

			
			[Serializable()]
			public class Input {
					[ System.Xml.Serialization.XmlElement("ID") ]
					public string ID { get; set; }
					[ System.Xml.Serialization.XmlElement("type") ]
					public string type { get; set; }
			}

			
			[Serializable()]
			public class CssStyle {
					[ System.Xml.Serialization.XmlElement("selector") ]
					public string selector { get; set; }
			}

			
			[Serializable()]
			public class CssDeclaration {
					[ System.Xml.Serialization.XmlElement("property") ]
					public string property { get; set; }
					[ System.Xml.Serialization.XmlElement("value") ]
					public string value { get; set; }
			}

			
			[Serializable()]
			public class Image {
					[ System.Xml.Serialization.XmlElement("ID") ]
					public string ID { get; set; }
					[ System.Xml.Serialization.XmlElement("alt") ]
					public string alt { get; set; }
			}

