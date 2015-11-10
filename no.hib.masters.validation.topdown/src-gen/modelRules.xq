
(: ****** PROTECTED SECTION ****** :)

declare namespace difiFunctions = "www.example.org";
declare function difiFunctions:is-value-in-sequence
  ( $value as xs:anyAtomicType? ,
    $seq as xs:anyAtomicType* )  as xs:boolean {

   $value = $seq
 };

(: ****** END OF PROTECTED SECTION ****** :)

				(: HtmlRoot -> FormStep :)

					for $HtmlRoot in doc("test.html")//HtmlRoot
					let $HtmlRootFormStep := $HtmlRoot/@steps
					where not(difiFunctions:is-value-in-sequence($HtmlRootFormStep, doc("test.html")//FormStep/@id))
					return $HtmlRoot

				(: FormStep must contain stepTitle :)

					for $FormStep in doc("test.html")//FormStep
					where empty($FormStep/@stepTitle)
					return $FormStep


				(: FormElement must contain ID :)

					for $FormElement in doc("test.html")//FormElement
					where empty($FormElement/@ID)
					return $FormElement


				(: label -> input :)

					for $label in doc("test.html")//label
					let $labelinput := $label/@for
					where not(difiFunctions:is-value-in-sequence($labelinput, doc("test.html")//input/@id))
					return $label
				(:  label <-> input :)
					(: bidirectional :)
					for $label in doc("test.html")//label
					let $labelinput := $label/@id
					where not(difiFunctions:is-value-in-sequence($labelinput, doc("test.html")//label/@for))
					return $label
				(: label must contain ID :)

					for $label in doc("test.html")//label
					where empty($label/@ID)
					return $label

				(: label must contain value :)

					for $label in doc("test.html")//label
					where empty($label/@value)
					return $label


				(: input -> label :)

					for $input in doc("test.html")//input
					let $inputlabel := $input/@labelledBy
					where not(difiFunctions:is-value-in-sequence($inputlabel, doc("test.html")//label/@id))
					return $input
				(:  input <-> label :)
					(: bidirectional :)
					for $input in doc("test.html")//input
					let $inputlabel := $input/@id
					where not(difiFunctions:is-value-in-sequence($inputlabel, doc("test.html")//input/@labelledBy))
					return $input
				(: input must contain ID :)

					for $input in doc("test.html")//input
					where empty($input/@ID)
					return $input

				(: input must contain type :)

					for $input in doc("test.html")//input
					where empty($input/@type)
					return $input


				(: CssStyle -> CssDeclaration :)

					for $CssStyle in doc("test.html")//CssStyle
					let $CssStyleCssDeclaration := $CssStyle/@cssDeclarations
					where not(difiFunctions:is-value-in-sequence($CssStyleCssDeclaration, doc("test.html")//CssDeclaration/@id))
					return $CssStyle
				(: CssStyle must contain selector :)

					for $CssStyle in doc("test.html")//CssStyle
					where empty($CssStyle/@selector)
					return $CssStyle


				(: CssDeclaration must contain property :)

					for $CssDeclaration in doc("test.html")//CssDeclaration
					where empty($CssDeclaration/@property)
					return $CssDeclaration

				(: CssDeclaration must contain value :)

					for $CssDeclaration in doc("test.html")//CssDeclaration
					where empty($CssDeclaration/@value)
					return $CssDeclaration


				(: img must contain ID :)

					for $img in doc("test.html")//img
					where empty($img/@ID)
					return $img

				(: img must contain alt :)

					for $img in doc("test.html")//img
					where empty($img/@alt)
					return $img


