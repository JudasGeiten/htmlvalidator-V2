

declare namespace difiFunctions = "www.example.org";
declare variable $doc external;
declare function difiFunctions:is-value-in-sequence
  ( $value as xs:anyAtomicType? ,
    $seq as xs:anyAtomicType* )  as xs:boolean {

   $value = $seq
 };

declare function difiFunctions:to-result-format
($value as node(), $msg as xs:string) as node() {
	<result>
		<element>{$value}</element>
		<errorMessage>{$msg}</errorMessage>
	</result>
};

(: ****** PROTECTED SECTION ****** :)
<results>{
				(: label -> input :)

					for $label in $doc//label
					let $labelinput := $label/@for
					where not(difiFunctions:is-value-in-sequence($labelinput, $doc//input/@id))
					return difiFunctions:to-result-format($label, "Violates lowerbound constraint"),
					(: label <- input :)
					for $input in $doc//input
					let $inputId := $input/@id
					where not(difiFunctions:is-value-in-sequence($inputId, $doc//label/@for))
					return difiFunctions:to-result-format($input, "Violates lowerbound constraint"),
				(: input -> label :)

					for $input in $doc//input
					let $inputlabel := $input/@labelledBy
					where not(difiFunctions:is-value-in-sequence($inputlabel, $doc//label/@id))
					return difiFunctions:to-result-format($input, "Violates lowerbound constraint"),
					(: input <- label :)
					for $label in $doc//label
					let $labelId := $label/@id
					where not(difiFunctions:is-value-in-sequence($labelId, $doc//input/@labelledBy))
					return difiFunctions:to-result-format($label, "Violates lowerbound constraint"),
				(: input must contain type :)

					for $input in $doc//input
					where empty($input/@type)
					return difiFunctions:to-result-format($input, "input must contain the attribute type"),

				(: input must contain id :)

					for $input in $doc//input
					where empty($input/@id)
					return difiFunctions:to-result-format($input, "input must contain the attribute id"),

				(: img must contain alt :)

					for $img in $doc//img
					where empty($img/@alt)
					return difiFunctions:to-result-format($img, "img must contain the attribute alt"),

				(: img must contain title :)

					for $img in $doc//img
					where empty($img/@title)
					return difiFunctions:to-result-format($img, "img must contain the attribute title")

}</results>
(: ****** END OF PROTECTED SECTION ****** :)
